public int strDist(String str, String sub) {
    if(str.length()>=sub.length() && str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub))
      return str.length();
    else if(str.length()>=sub.length() && !(str.substring(0,sub.length()).equals(sub)))
      return strDist(str.substring(1),sub);
    else if(str.length()>=sub.length()  && !(str.substring(str.length()-sub.length()).equals(sub)))  
      return strDist(str.substring(0,str.length()-1),sub);  
    return 0;
  }
  