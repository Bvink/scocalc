package wildtornado.scocalc;

import wildtornado.scocalc.companies.Company;
import wildtornado.scocalc.companies.GenericCompany;
import wildtornado.scocalc.companies.JenkyCompany;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private Company company;

    public Calc(DataInput dp, DataInput comparison) {
        this.company = determineCompany(dp, comparison);
    }

    private Company determineCompany(DataInput dp, DataInput comparison) {
        switch (dp.getCompanyID()) {
            case 1:
                return new JenkyCompany(dp, comparison);
            default:
                return new GenericCompany(dp, comparison);
        }
    }

    public Score generateScore() {
        return this.company.generateScore();
    }
}