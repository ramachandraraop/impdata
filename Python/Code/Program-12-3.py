filename = "text_file.txt"
wordCount = 0
lineCount = 0
for line in open(filename):
    lineCount += 1
    wordCount += len(line.split())

print("No Of Lines: " + str(lineCount))
print("No Of Words: " + str(wordCount))


