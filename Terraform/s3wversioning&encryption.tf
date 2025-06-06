resource "aws_s3_bucket" "my_bucket" {
  bucket = "my-versioned-bucket-123"
  versioning {
    enabled = true
  }
server_side_encryption_configuration {
    rule {
      apply_server_side_encryption_by_default {
        sse_algorithm = "AES256"
      }
    }
  }
  tags = {
    Environment = "Production"
  }
}
