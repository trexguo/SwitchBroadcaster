git filter-branch -f --env-filter "
    GIT_AUTHOR_NAME='trexguo'
    GIT_AUTHOR_EMAIL='t.rex.guo@gmail.com'
    GIT_COMMITTER_NAME='trexguo'
    GIT_COMMITTER_EMAIL='t.rex.guo@gmail.com'
  " HEAD