# DevOps Practice Repository

Welcome to the **DevOps Practice Repository**! This repo is a hands-on space for learning and experimenting with various DevOps tools, methodologies, and CI/CD workflows.

## 📌 Purpose

This repository is intended for practicing and demonstrating core DevOps concepts including:

- Infrastructure as Code (IaC)
- Continuous Integration / Continuous Deployment (CI/CD)
- Containerization with Docker
- Orchestration with Kubernetes
- Monitoring and Logging
- Automation with Shell/Python Scripts
- Cloud Services (AWS/GCP/Azure)

## 🛠️ Tech Stack / Tools

This repo may include usage of the following tools and services:

- **Terraform** – For Infrastructure as Code (IaC)
- **Docker** – Containerization
- **Kubernetes (k8s)** – Orchestration
- **GitHub Actions / Jenkins** – CI/CD
- **Ansible** – Configuration Management
- **Prometheus & Grafana** – Monitoring & Visualization
- **AWS/GCP/Azure** – Cloud infrastructure
- **Python / Bash** – Scripting and automation


## 📁 Directory Structure

```
Devops/
│
├── README.md
├── scripting/
│   ├── add_manage_users.sh
│   ├── automate_file_backup.sh
│   ├── bashprac.sh
│   ├── deploy_simple_webserver.sh
│   ├── jenkins_job_remote_trigger.sh
│   ├── upgrade_system.sh
│   └── groovy/
│       ├── cleaningupoldbuilds.groovy
│       ├── downstreamtrigger.groovy
│       └── notifyingbuildfailswemail.groovy
├── Terraform/
│   ├── cloudwatchforEC2.tf
│   ├── EC2fast.tf
│   ├── EKSspinup.tf
│   ├── s3wversioning&encryption.tf
│   ├── secureIAMforEC2.tf
│   ├── simpleLambdaFunc.tf
│   └── VPCwpublicandprivatesubnet.tf
```


### Folder & File Descriptions (with Context)

- **scripting/**: Shell and Groovy scripts for automation, user management, backups, and CI/CD tasks.
	- `add_manage_users.sh`: Adds a new user, sets a password, and adds the user to the sudo group.
	- `automate_file_backup.sh`: Backs up files from a source to a destination directory, organizing by date.
	- `bashprac.sh`: Clears the Windows temp folder and checks for internet connectivity.
	- `deploy_simple_webserver.sh`: Installs and starts an Nginx web server on a Linux system.
	- `jenkins_job_remote_trigger.sh`: Remotely triggers a Jenkins job using the Jenkins REST API and user credentials.
	- `upgrade_system.sh`: Updates and upgrades all packages on a system using yum, then cleans up cached data.
	- **groovy/**: Jenkins Groovy scripts for pipeline automation and notifications.
		- `cleaningupoldbuilds.groovy`: Deletes Jenkins builds older than 30 days for all jobs.
		- `downstreamtrigger.groovy`: Triggers a specified downstream Jenkins job programmatically.
		- `notifyingbuildfailswemail.groovy`: Monitors a Jenkins job for failures and sends an email notification if a build fails (requires SMTP configuration).

- **Terraform/**: Infrastructure as Code (IaC) scripts for AWS resources.
	- `cloudwatchforEC2.tf`: Sets up a CloudWatch alarm for EC2 CPU utilization above 70%.
	- `EC2fast.tf`: (Not read, but likely provisions EC2 instances quickly.)
	- `EKSspinup.tf`: Uses the AWS EKS module to spin up a Kubernetes cluster with node groups.
	- `s3wversioning&encryption.tf`: Creates an S3 bucket with versioning and AES256 server-side encryption enabled.
	- `secureIAMforEC2.tf`: Defines an IAM role for EC2 with an assume role policy for the EC2 service.
	- `simpleLambdaFunc.tf`: Provisions a Lambda function using a deployment package and IAM role.
	- `VPCwpublicandprivatesubnet.tf`: Uses the AWS VPC module to create a VPC with public and private subnets, and a NAT gateway.

