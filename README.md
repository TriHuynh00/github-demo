# Github Instruction Project

This repository is created to demonstrate the github features to students learning Information Technology and Software Engineering courses in RMIT.

The Brief Instruction section shows the command to 
**clone**, 
**upload** modified file, 
and **download** the most recent update.

Further details of each feature above will be demonstrated in the Git Guideline section:

## Brief Instruction

GitHub operations can be done in command line (like Git Bash), 
or a GUI application (like in IDEs such as IntelliJ, VS Code, or other Git GUI)

### Command Lines

The common procedure of working with GitHub is as follows:

1. **Clone** the **repository** from a GitHub server to a local machine
> git clone yourRepositoryUrl

2. Make changes to *files* or _folders_ inside the repository. 
To prepare for **uploading** the selected _files_ or _folders_ to the GitHub server, 
use the **git add** command. We can add single or multiple files in one **add** command:

> git add fileName1 fileName2

> git add folder1 folder2

**Tip:** **Git only uploads modified file(s) in a folder** when we call **git add <folderName>**. 
Thus, we usually do not have to add each changed file into the **git add** command.

3. **Commit** the selected files or folders with a message to explain the file's modification.
> git commit -m "Explanation of Files or Folders Modification"

4. **Push** (Upload) the selected files or folders to the GitHub server. 
> git push

After pushing successfully, the GitHub server **updates** the changes to the repository 
if no conflict exists.

5. When we want to **download** the **up-to-date repository** 
after our teammates push their code, the command is:
> git pull

### GUI-based

// Introduce quickly how it works in IDE.

## Git Guideline

This section introduces the mechanism of frequently used Git commands. 
We refer to the **Brief Instruction** section if you need a quick start on the project.

## Create and clone a repository

### Cloning a repository

When you or your teammate creates a repository on the GitHub website, 
that repository exists in the GitHub server but not on our computer. 
We need to clone the repository into a folder to "download" the GitHub repository into a machine. 

#### Cloning using GitHub Credential

First, we need a folder to store the repository. 
Create a folder at the desired location in your computer. 
Next, clone the repository using the command below:

> clone http://**<repository_url>**

Clicking the "<> Code" button on the repository home page shows the **repository_url**, as illustrated in the picture below.

![An image showing the <> Code button, clicking on the button opens a pop-up window. Under the HTTPS tab is an input field containing the URL of the GitHub repository](picture/repoCodeCloneUrl.png)

Cloning the HTTPS URL of the repo does not require any additional setup. 
The command to clone using the HTTPS URL is as follows:

> clone https://github.com/TriHuynh00/github-demo.git

## Add new changes to a repository

- Describe the Working Repository, Staging Area, and .git Repository to explain that
adding files are preparing them for commit, but we don't add the file directly to the
repo

Introduce: 
1. git add fileName
2. git add -u : Stage modified and deleted files. NOT new files
3. git add .  : Recursively add the entire directory, including files start with dot
4. git add -A : Stage all modified, deleted, and new files

Add UI Examples

## Commit the change

Commit creates a snapshot of our repo. 
A chain of commits shows the history of our repository.

Introduce:
1. git commit -m "Message" : Creates a snapshot of added files into the repo
2. git commit --amend      : 

Add UI Examples

## Push the change to the repository

### Pushing using SSH

One disadvantage of cloning the repository with HTTPS URL is that
users must give their credentials (username and password) for every push.
Another way to avoid this inconvenience is using the Secure Shell (SSH) key verification mechanism,
which requires users to configure their SSH key once during the entire GitHub session.
Therefore, we can push and pull code without being prompted for credentials.

To set the SSH Key, navigate to your avatar to the top right corner of the screen
and select Settings.

![A picture showing the avatar icon is on the top right of the screen. Clicking this icon opens the User Option](picture/avatarTopRight.png)

![A picture showing the Settings option near the bottom of the User Options panel](picture/settingLocation.png)

// Introduce into pushing in IDE

### Using Authtoken

// Create a single auth token.

// May have problems with multiple account. Not knowing which token to use.

## Pull the code from the repository

git pull

// Conflict Resolution

## Merge local code into the remote repository

## Create feature branch in a repository

