package Interface;

import login.Credential;

public interface ILogin {
	public boolean authenticate(Credential credential);
}


//contoh penerapan dari interface segregation di mana interface ini memiliki method yang spesifik dan bisa digunakan pada semua class yang mengimplementasinya pada kasus ini.