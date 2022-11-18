package org.study.connect;

import java.io.IOException;
import java.sql.SQLException;

public interface SqlCommand {
	
	abstract void executeCommand() throws IOException, SQLException, ClassNotFoundException;
	
}
