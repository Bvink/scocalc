package wildtornado.scocalc.calculators;

import wildtornado.scocalc.calculators.calcs.*;
import wildtornado.scocalc.constants.Constants;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactory {

    Map<String, Calculator> calculators = new HashMap<String, Calculator>() {
        {
            put(Constants.CODE_DUPLICATION_CALCULATOR, new CodeDuplicationCalculator());
            put(Constants.CODE_VIOLATIONS_CALCULATOR, new CodeViolationsCalculator());
            put(Constants.COMMENT_CALCULATOR, new CommentCalculator());
            put(Constants.LINES_OF_CODE_CALCULATOR, new LinesOfCodeCalculator());
            put(Constants.TECHNICAL_DEBT_CALCULATOR, new TechnicalDebtCalculator());
            put(Constants.TEST_COVERAGE_CALCULATOR, new TestCoverageCalculator());
        }
    };

    public Calculator newInstance(String c) {
        return calculators.get(c);
    }
}
