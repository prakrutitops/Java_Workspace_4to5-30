package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="uname")
		private String uname;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
			
		
		
		
}
