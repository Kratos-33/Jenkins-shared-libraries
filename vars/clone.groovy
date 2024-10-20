def call(String url , String branch){
  echo "This is code clone stage"
  git url: "${url}" , branch: "${branch}"
  echo "This is cloning the code"
}
