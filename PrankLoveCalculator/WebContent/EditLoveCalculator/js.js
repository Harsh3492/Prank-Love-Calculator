function valid() {
  var name=document.forms["fname"]["UserName"].value;
  if (name=="")
  {
    alert("Please Enter Name");
    return false;
  }
}
