# Improving-Ottawa Blogs

## Introduction
This repository is for Improving-Ottawa technical authors to create 
blogs using Hugo. 

## Pre-requisites
* Install hugo: `brew install hugo`

## Getting a Preview While Editing
* Run `hugo server -D --noHTTPCache ` with your current directory at the 
  root of this repository
* Open `http://localhost:1313/` in your browser
* The options specify that "draft" pages should be includeed and that 
  HTTP caching is disabled. 
* Changes to the source should be reflected immediately on the browser 

## Adding Yourself As A New Author
* Place an image of yourself in `assets/images/authors/<name>.jpg`
* Create a new content directory using your first name in `content/english`
* If you plan to write in French create it in `content/french`
* Add the name of the content directory you created to `config.toml` in the mainSections parameter  

## Github Workflow
* Found in `.github/workflows/gh_pages.yml`
* Builds the site into a deployable branch for GitHub pages
* Automatic deployment

