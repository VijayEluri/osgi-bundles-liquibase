package liquibase.statement.core;

import liquibase.statement.core.DropColumnStatement;
import liquibase.statement.SqlStatement;

public class DropColumnStatementTest extends AbstractSqStatementTest {

    @Override
    protected SqlStatement createStatementUnderTest() {
        return new DropColumnStatement(null, null, null);
    }

}