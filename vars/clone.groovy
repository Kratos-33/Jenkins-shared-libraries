def call(String url , String branch){
  echo "This is code clone stage"
  git url: "https://github.com/Kratos-33/django-notes-app.git" , branch: "main"
  echo "This is cloning the code"
}
