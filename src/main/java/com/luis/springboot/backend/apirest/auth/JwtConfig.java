package com.luis.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEowIBAAKCAQEAq/rxeX7/Tm9d23n6OqdZN3W1CdKXFKrew90QoYCznNuYokTq\n" + 
			"QLTxsGPvAf/ve0z2bqUw9Ges89uXqGd6Hc13/Wje4CgA9aeG6oRnh4NhhYXpZmmO\n" + 
			"rka3BYbEeD//xNvFnSHS7dZaRavMb/IBsEL9dWeNxDO625k27ahRLMjaXhFeuAQM\n" + 
			"Uyin+QvkZyj20E3GfmSs8NJvkpP2axiExGPBbGwbH1ZcYKqJufqU+l0NbKGK+W6X\n" + 
			"Q73S7rhtxlVIbb8xVapQ7boMgk4tn3dChPwcTamZqrKXmExOtQ0PknOS4tVCxgPX\n" + 
			"oqlqv+BoW/WMxB0d8TSC92ohTxSbq5H0kwcmzwIDAQABAoIBAFHHlqQrm8P0eTEw\n" + 
			"o6jYgzg4JMpy9ZzCVAPXT109Eiv40G/5TVtPr84s9y6AQaTkSBr9OnY+BqQ/O7K8\n" + 
			"4fjiB7jc8X6uBybJbwJ9y61I8ErKDt7AOzTsM4PRPgPgiwNVbnb16pNmZq7Srvhc\n" + 
			"oCjs8hGuGF/AKY7bIJ+Kdm9RY2VvHYlLmb8+3i7erSWQiscoX+cIx/r9AgPTH9ci\n" + 
			"0MGxcOci1TcIGoKtomE+0AQ/NXNr0gfqOKtbbJ693Oh1Ud8VtMAC2397rrMiMGFb\n" + 
			"SFeSto6xtPRi+/xBJ3sS2yFtWCtk0KtG2Uf/+0mnzs2D2iM4wT1mRhrToJVZOtym\n" + 
			"g3j5K0ECgYEA0iIuwnWiuYzDcNVEzs60/gvnRapZuD0JS77Mz7+VCWRddxxa5HEj\n" + 
			"bWp8x48UxGPbsdaQUDh86MJjxFgID3nBxvBX+9yukBqA9Q9i+eABRNOzpVZeVdTQ\n" + 
			"tJifWj7AJGSR/SWPzdVcDufZaUQlyta91pUCtlNjTaOKWCr/TQgFL0kCgYEA0YTW\n" + 
			"BPAVR+pBUi8KCgq0ny6Q3RuEeKIofQwF+371Aq5bGW6ub4iuAZsWv36s2dpEidFx\n" + 
			"aantF9QeSLWedlRNKhPm0tRUSETVPg3MYCXK6qd3rq9pxq6kJsauhRalY1C2gYbk\n" + 
			"tIs2qNFU5mfMzZl+ZFLVeKVC1Md82xAN58kSbVcCgYBPFzSYVqR/yD6LiooSePTg\n" + 
			"peRPcVXBpZ+JFfCKxSY4WcFgIpkHYJogBbOffPgpDxjSr9qzhv9ksD3S2ft2r7JC\n" + 
			"yZWkI6TEcmVVV4w+VpTDrhbwxThOgAJp5wQbeIDjccMNEAU3SPYUWimXmGHNHdRo\n" + 
			"Hr/dljdLMqHQm6Zp/PnOmQKBgCNQRlpStOOIIjZd401J/KOPz67UwoEqo7Rf4GpB\n" + 
			"Pb6T8Jrawt/do6Z1o2HnUe7uEPtBp+HtWB7aC7ipk+nRz6e17wO98e60W1S4MqhJ\n" + 
			"9meSjmONAUERkm1Os3+PD5Urt3cha07a3/2YOr0S5bwJkPoL1Bsfj6IZdXveutlE\n" + 
			"VKzFAoGBAMkH0vxaF0L2IuT80QAfHxSkQaMcysFJ54xQJboo2/mjxfioGZNrzW6a\n" + 
			"eoZdVmlE+rRFHU6dbfn2uM0egPl3gsPeeab+/wExlEIauYhInhQSc53p0w33zNM0\n" + 
			"HdkCdXrMTeNhms0OlArGig1Z4yiqijeRd3thMwVYn+1BScgyRC7j\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq/rxeX7/Tm9d23n6OqdZ\n" + 
			"N3W1CdKXFKrew90QoYCznNuYokTqQLTxsGPvAf/ve0z2bqUw9Ges89uXqGd6Hc13\n" + 
			"/Wje4CgA9aeG6oRnh4NhhYXpZmmOrka3BYbEeD//xNvFnSHS7dZaRavMb/IBsEL9\n" + 
			"dWeNxDO625k27ahRLMjaXhFeuAQMUyin+QvkZyj20E3GfmSs8NJvkpP2axiExGPB\n" + 
			"bGwbH1ZcYKqJufqU+l0NbKGK+W6XQ73S7rhtxlVIbb8xVapQ7boMgk4tn3dChPwc\n" + 
			"TamZqrKXmExOtQ0PknOS4tVCxgPXoqlqv+BoW/WMxB0d8TSC92ohTxSbq5H0kwcm\n" + 
			"zwIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
}
