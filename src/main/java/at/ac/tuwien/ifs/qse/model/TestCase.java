package at.ac.tuwien.ifs.qse.model;

public class TestCase {

    private String testCaseId;
    private String testCaseName;
    private boolean positive;

    public TestCase(String testCaseId, String testCaseName, boolean positive) {
        this.testCaseId = testCaseId;
        this.testCaseName = testCaseName;
        this.positive = positive;
    }

    public String getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(String testCaseId) {
        this.testCaseId = testCaseId;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
}