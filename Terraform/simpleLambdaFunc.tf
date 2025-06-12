resource "aws_lambda_function" "example" {
  filename         = "lambda_function_payload.zip"
  function_name    = "example_lambda"
  role             = aws_iam_role.lambda_exec.arn
  handler          = "index.handler"
  runtime          = "nodejs14.x"
  source_code_hash = filebase64sha256("lambda_function_payload.zip")
}
