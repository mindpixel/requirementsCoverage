package at.ac.tuwien.ifs.qse.requirementsParser;

import at.ac.tuwien.ifs.qse.persistence.Persistence;
import at.ac.tuwien.ifs.qse.xmlParser.ParserRunner;
import at.ac.tuwien.ifs.qse.xmlParser.RequirementsSAXHandler;

/**
 * Parses the file containing the requirements of the target project.
 */
public class RequirementsParser {
    private Persistence persistence;

    public RequirementsParser(Persistence persistence) {
        this.persistence = persistence;
    }

    public void parseRequirements() throws Exception {
        RequirementsSAXHandler requirementsSAXHandler = new RequirementsSAXHandler(persistence);
        ParserRunner.runXMLParser(requirementsSAXHandler, persistence.getRequirementsPath());
    }
}