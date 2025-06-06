import jenkins.model.*
import hudson.model.*
// Specify the name of the downstream job
def jobName = "DownstreamJob"
// Get the job instance from Jenkins
def job = Jenkins.instance.getItem(jobName)
if (job != null) {
    println "Triggering job: ${jobName}"
    // Schedule a build with a default cause (UserIdCause for example)
    job.scheduleBuild(0, new Cause.UserIdCause())
} else {
    println "Job not found: ${jobName}"
}
