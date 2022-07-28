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

## Github Workflow
* Found in `.github/workflows/gh_pages.yml`
* Builds the site into a deployable branch for GitHub pages
* Automatic deployment

