import jenkins.model.*
import hudson.model.*
// Define how old a build should be (in days) to be deleted
def daysThreshold = 30
def thresholdMillis = daysThreshold * 24 * 60 * 60 * 1000
def now = System.currentTimeMillis()
Jenkins.instance.getAllItems(Job.class).each { job ->
    job.builds.each { build ->
        if (now - build.getTimeInMillis() > thresholdMillis) {
            println "Deleting build #${build.getNumber()} of job ${job.name}"
            build.delete()
        }
    }
}
