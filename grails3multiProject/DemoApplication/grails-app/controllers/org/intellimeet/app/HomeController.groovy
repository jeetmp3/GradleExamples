package org.intellimeet.app
import org.mail.server.Mail;

class HomeController {

    def index(String to, String subject, String body) {
	render Mail.send(to, subject, body)
    }
}
