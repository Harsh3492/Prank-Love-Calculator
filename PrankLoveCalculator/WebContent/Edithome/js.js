function valid() {
  var name=document.forms["fname"]["name"].value;
  if (name=="")
  {
    alert("Please Enter Name");
    return false;
  }
  var x = document.forms["fname"]["email"].value;
  if (x=="")
  {
    alert("Please Enter email");
    return false;
  }
  var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Please Enter valid email id");
        return false;
      }
}
