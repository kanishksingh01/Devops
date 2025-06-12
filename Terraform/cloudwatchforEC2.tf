resource "aws_cloudwatch_metric_alarm" "cpu_util" {
  alarm_name          = "high-cpu"
  comparison_operator = "GreaterThanThreshold"
  evaluation_periods  = "2"
  metric_name         = "CPUUtilization"
  namespace           = "AWS/EC2"
  period              = "120"
  statistic           = "Average"
  threshold           = "70"
  alarm_description   = "This metric monitors high CPU usage"
  dimensions = {
    InstanceId = aws_instance.web.id
  }
}
