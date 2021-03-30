package com.vo;

import javax.persistence.*;

@Entity

@Table(name="userlist")

public class RegVO
	{
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private int id;
		
		@Column(name="username")
		private String username;
		
		@Column(name="password")
		private String password;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
	}
