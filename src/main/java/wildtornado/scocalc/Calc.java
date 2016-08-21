package wildtornado.scocalc;

import wildtornado.scocalc.companycalculators.CompanyCalculations;
import wildtornado.scocalc.companycalculators.companyCalculationsFactory;
import wildtornado.scocalc.constants.Constants;
import wildtornado.scocalc.enums.CompanyId;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private final companyCalculationsFactory CC_FACTORY = new companyCalculationsFactory();

    public Score generateScore(DataInput dp, DataInput comp) {
        CompanyCalculations companyCalculations = determineCompany(dp, comp);
        return companyCalculations.generateScore();
    }

    private CompanyCalculations determineCompany(DataInput dp, DataInput comp) {

        CompanyId id = determineCompanyID(dp.getCompanyID());
        try {
            return obtainCompanyCalculations(id.getName(), dp, comp);
        } catch (Exception e) {
            System.out.println("The company doesn't exist, using a generic company instead.");
        }
        return obtainCompanyCalculations(Constants.GENERIC_COMPANY, dp, comp);
    }

    private CompanyId determineCompanyID(int id) {
        for (CompanyId cID : CompanyId.values()) {
            if (cID.getCompanyID() == id) {
                return cID;
            }
        }
        return null;
    }

    private CompanyCalculations obtainCompanyCalculations(String s, DataInput dp, DataInput comp) {
        return CC_FACTORY.newInstance(s, dp, comp);
    }
}