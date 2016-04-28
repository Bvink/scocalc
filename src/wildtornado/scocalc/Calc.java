package wildtornado.scocalc;

import wildtornado.scocalc.companies.Company;
import wildtornado.scocalc.companies.GenericCompany;
import wildtornado.scocalc.companies.JenkyCompany;
import wildtornado.scocalc.objects.DataInput;
import wildtornado.scocalc.objects.Score;

public class Calc {

    private Company company;

    public Calc(DataInput dp) {
        this.company = determineCompany(dp);
    }

    private Company determineCompany(DataInput dp) {
        switch (dp.getCompanyID()) {
            case 1:
                return new JenkyCompany(dp);
            default:
                return new GenericCompany(dp);
        }
    }

    public Score generateScore() {
        return this.company.generateScore();
    }
}