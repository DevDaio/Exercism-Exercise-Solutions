

class SqueakyClean {
    static String clean(String identifier) {
    	StringBuilder newSet = new StringBuilder();
     boolean isBool = false;
    for (char chär : identifier.toCharArray()) {
         	switch (chär) {
	case ' ':
	newSet.append('_');
	break;
    case '-':
    isBool=true;
    break;
    case '4' : newSet.append('a'); break;
    case '3' : newSet.append('e'); break;
    case '0' : newSet.append('o'); break;
    case '1' : newSet.append('l'); break;
    case '7' : newSet.append('t'); break;
    default:
    if (isBool == true) {
    newSet.append(Character.toUpperCase(chär));
    isBool=false;
    break;no
    } else if (Character.isLetter(chär)){
    newSet.append(chär);
    break;
    }
    break;
     }
     }
    return newSet.toString();
}
}
