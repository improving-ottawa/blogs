# Improving-Ottawa Blogs

## Introduction
This repository is for Improving-Ottawa technical authors to create 
and maintain their own blog pages using Hugo. 

## Pre-requisites
* Install hugo: `brew install hugo`

## Before You Do ANYTHING below
* [Read up on how hugo works](https://gohugo.io/documentation/)
* [Read up on how this `bookworm` template works](https://docs.gethugothemes.com/bookworm/languages/)

## Adding Yourself As A New Author
* Place your Yoppworks image of yourself in `/assets/images/authors/<name>.jpg`
* Create a new author profile file using your first name in `/content/author` and follow a similar style to other authors in that directory.
* Create a new content directory using your first name in `/content/english`, or if you plan to write in French, create that directory in `/content/french` instead.
* Add the name of the content directory you just created to `/config.toml` in the `mainSections` parameter (or it won't get indexed)
* Add an `_index.md` file in the directory you just created that is similar to another authors' but with your information in it.
* Open `menus.en.toml` or `menus.fr.toml` depending on your language in the `config/_default` directory and add yourself to both the `Authors` and `Blogs` section, similar to others

## Writing Your Blogs
* Blogs are markdown files in your content/{english|french}/{name} directory
* Your `_index.md` page can be used as an index if you like.
* Add whatever you want. They will be indexed automatically. Use a `unique-slug-style-naming-convention` that provides the title of your blog or something catchy

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

