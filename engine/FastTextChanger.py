import os
import re

firstTextToReplace = "_pack"
firstReplacingText = ""
secondTextToReplace = "areaGold"
secondReplacingText = "areaGold"

if not os.access("./FTCbackupFiles", os.F_OK):
    os.mkdir("./FTCbackupFiles")

def createBackupFile(root, fileName):

    backupFileRoot = "/" + root.replace("./src/", "")
    backupFilePath = "./FTCbackupFiles" + backupFileRoot + "/"

    if not os.access(backupFilePath, os.F_OK):
        os.mkdir(backupFilePath)

    backupFilePath = backupFilePath + fileName
    backupFile = open(backupFilePath, 'w')
    return backupFile

for root, dirNames, fileNames in os.walk('./src/'):
    for fileName in fileNames:
        if not re.search("java\Z", fileName):
            continue

        path = root + "/" + fileName
        file = open(path, 'r+')

        backupFile = createBackupFile(root, fileName)

        try:
            text = file.read()
            backupFile.write(text)

            text = text.replace(firstTextToReplace, firstReplacingText)
            text = text.replace(secondTextToReplace, secondReplacingText)

            file.seek(0)
            file.truncate()
            file.write(text)
        finally:
            file.close()
            backupFile.close()
