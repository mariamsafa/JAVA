/*7. Create an interface named Account including getName(), setName(), getPassword() and
setPassword(). Create another interface named Email which includes getOtp(), setOtp(), and
verifyEmail(). Create a class Person which must implement them. Complete the code. */


interface account{
    void getname();
    void setname();
    void getpass();
    void setpass();

}

interface email{
    void getotp();
    void setotp();
    void verifyemail();
}

class person implements account,email{

    public void getname(){

    }
    public void setname(){

    }
    public void getpass(){

    }
    public void setpass(){

    }
    public void getotp(){

    }
    public void setotp(){

    }
    public void verifyemail(){
        
    }

}
