class Testing {
    public String defangIPaddr(String address) {
        StringBuilder add = new StringBuilder();
        add.append("");
        for(int i = 0; i < address.length(); i++){
            if(address.charAt(i) == '.'){
                add.append("[.]");
                continue;
            }
            add.append(address.charAt(i));
        }
        address.replace('0', '0');
        return add.toString();
    }
}