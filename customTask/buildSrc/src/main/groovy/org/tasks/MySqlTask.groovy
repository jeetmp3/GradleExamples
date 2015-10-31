package org.tasks;

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MySqlTask extends DefaultTask {
	String hostname = 'localhost'
	int port = 3306
	def sql
	def database
	def username
	def password

	@TaskAction
	def runQuery() {
		def cmd
		if(database) {
			cmd = "mysql -u${username} -p${password} -h ${hostname} -p ${port} ${database} -e "
		} else {
			cmd = "musql -u${username} -p${password} -h ${hostname} -p ${port} -e "
		}
		
		project.exec {
			commandLine = cmd.split().toList() + sql
		}
	}
}
