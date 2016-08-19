package wildtornado.scocalc.companycalculators;

import wildtornado.scocalc.companycalculators.comps.GenericCompanyCalculations;
import wildtornado.scocalc.companycalculators.comps.JenkyCompanyCalculations;
import wildtornado.scocalc.companycalculators.comps.MinimumCompanyCalculations;
import wildtornado.scocalc.constants.Constants;
import wildtornado.scocalc.objects.DataInput;

import java.util.HashMap;
import java.util.Map;

public class companyCalculationsFactory {

    private DataInput dp;
    private DataInput comp;

    Map<String, CompanyCalculations> companyCalculations = new HashMap<String, CompanyCalculations>() {
        {
            put(Constants.GENERIC_COMPANY, new GenericCompanyCalculations(dp, comp));
            put(Constants.JENKY_COMPANY, new JenkyCompanyCalculations(dp, comp));
            put(Constants.MINIMUM_COMPANY, new MinimumCompanyCalculations(dp, comp));
        }
    };

    public CompanyCalculations newInstance(String cc, DataInput dp, DataInput comp) {
        this.dp = dp;
        this.comp = comp;
        return companyCalculations.get(cc);
    }
}
