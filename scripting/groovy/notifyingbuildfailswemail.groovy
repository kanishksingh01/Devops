import jenkins.model.*
import hudson.model.*
import javax.mail.*
import javax.mail.internet.*
// Define the job to monitor
def jobName = "JobToMonitor"
def job = Jenkins.instance.getItem(jobName)
if (job != null) {
    def lastBuild = job.getLastBuild()
    if (lastBuild != null && lastBuild.getResult()?.toString() == "FAILURE") {
        // Email settings
        def recipient = "devops@example.com"
        def subject = "Jenkins Build Failure: ${jobName} Build #${lastBuild.getNumber()}"
        def body = "The build of job ${jobName} (Build #${lastBuild.getNumber()}) has failed.\nPlease check Jenkins for details."
        
        // Configure SMTP properties (update these as needed)
        def props = new Properties()
        props.put("mail.smtp.host", "smtp.example.com")
        def session = Session.getDefaultInstance(props, null)
        
        try {
            def message = new MimeMessage(session)
            message.setFrom(new InternetAddress("jenkins@example.com"))
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient))
            message.setSubject(subject)
            message.setText(body)
            Transport.send(message)
            println "Notification sent for failed build."
        } catch (Exception e) {
            println "Failed to send email notification: ${e.getMessage()}"
        }
    } else {
        println "No recent failures in ${jobName}."
    }
} else {
    println "Job not found: ${jobName}"
}