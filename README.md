# Improving-Ottawa Blogs

## Introduction
This repository is for Improving-Ottawa technical authors to create 
and maintain their own blog pages using Hugo. 

## Pre-requisites
* Install hugo: `brew install hugo`

## Before You Do ANYTHING below
* [Read up on how hugo works](https://gohugo.io/documentation/)
* [Read up on how this `bookworm` template works](https://docs.gethugothemes.com/bookworm/languages/)

## Why Write A Blog?
* This is an EIP activity. 1 post = 1 point. 

## Adding Yourself As A New Author
* Place your Yoppworks image of yourself in `/assets/images/authors/<name>.jpg`
* This blog supports both English and French blogs. In the following instructions, replace {language} 
  with either "english" or "french". If  you want to go bilingual then do all the remaining instructions
  for both the Englisha and French cases.
* Create a new author profile file using your first name as `/content/author/{language}/{first-name}.md` and follow a similar style to other authors in that directory.
* Write a bio in your `/content/{language}/author/{first-name}.md` file. Adjust the front matter to suit yourself.
* Create a new content directory using your first name as `/content/{language}/{first-name}`. 
* Add the name of the content directory you just created to `/config.toml` in the `mainSections` parameter (or it won't get indexed)
* Add an `_index.md` file in the directory you just created that is similar to another authors' but with your information in it. 
* Start writing your blogs!
 
## How To Write Your Blogs
* Blogs are markdown files in your content/{language}/{name} directory.
* Your blogs will be listed in a grid when the "Blogs" menu is selected.  
* Add whatever you want. They will be indexed automatically. Use a `unique-slug-style-naming-convention` that provides the title of your blog or something catchy
* In the front matter:
  * set `draft: true` until you want it published. It will show up in preview mode (see below) because of the `-D` option but not on the published site.
  * set `draft: false` when you want to publish your article.
  * set `author: "Your Name"` but replace Your Name with your actual name. This is very important for attribution. Always spell it the same way.  
  * set `date: {date}` to a publishing date for this page. Don't change it thereafter.
  * set `tags: ["Tag1", "Tag2"]` to indicate tags for your page so it can be found more easily. Replace "Tag1" and "Tag2" with actual tags. Tags can be any relevant phrase.
  * set `categories: ["Cat1", "Cat2"]` to indicate categories for your page so it can be found more easily. Replace "Cat1" and "Cat2" with actual category names. Categories should be shared between authors and agreed upon.
* See the `contents/english/elements.md` file for examples of the kinds of things you can do in markdown and Hugo shortcodes.  
   
## About What You Post
* DO NOT CHANGE A SINGLE THING OUTSIDE THE `content` DIRECTORY! DRAGONS BE THERE.
* Blogs can be about anything about technology, your work, your life, processes, the industry, etc. Unlike the corporate site, there are no restrictions except what is noted below. 
* This is a publicly available resource. We expect professionalism in the content.
* Posting anything that reflects badly on Improving or Yoppworks is not welcome. Talk to your manager or the SMT instead.
* Posting hate speech, adult material, bad language, controversial topics, conspiracy theories, or things like that could get your blog deleted, and your privilege to post removed.
* This is a contributor driven shared system. Don't mess with others' content. Act responsibly. 

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

## Need Help?
* Ask in the *blogs-and-social-media* channel on slack.
