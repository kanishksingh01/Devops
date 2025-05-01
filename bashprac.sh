#!/bin/bash

TEMP_PATH="/c/Users/kanis/AppData/Local/Temp"

echo "Clearing temp files at: $TEMP_PATH"

# Remove all files and folders inside the temp directory
rm -rf "$TEMP_PATH"/* 2>/dev/null
rm -rf "$TEMP_PATH"/.* 2>/dev/null

echo "Temp folder cleared successfully!"

ping -c 1 google.com &>/dev/null

if [ $? -eq 0 ]; then
    echo "Internet is connected ✅"
else
    echo "No internet connection ❌"
fi
