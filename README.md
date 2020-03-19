# spring-security-oauth
Merupakan project sederhana spring untuk menunjukkan penerapan OAUTH 2 pada spring.

### Prerequisites
> JDK 1.8 Or Later <br>
> MySQL <br>
> Editor or IDE (Eclipse, IntelliJ, etc) <br>

### Test and Result
> Request :
```
curl -X POST \
  http://localhost:8083/oauth/token \
  -H 'authorization: Basic YWRtaW5hcHA6cGFzc3dvcmQ=' \
  -F grant_type=password \
  -F username=user1 \
  -F password=welcome1
```
> Response :
```
  {
    "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsibXcvYWRtaW5hcHAiXSwidXNlcl9uYW1lIjoidXNlcjEiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNTg0NjIxMTUyLCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiIwYTMxZWQ4Ni1hZmYxLTQyMmEtOWQyOS04OTEwYzkxZjY0MjAiLCJjbGllbnRfaWQiOiJhZG1pbmFwcCJ9.Z5-0TmNx2cXOUyfqGP2-GuI2m4pEgjqdgk0BX67caxWeYf2G8HCpLzm6JSHmyDaG05lPUS-P7c35zV0KoaqgzmVe-swfz_TW_aeg0tkVP3LB1EN4_zwpBGXRVjifwawimsBGby7rsrhTZ_jfJ7_dEw3DbbyzWZGzW6uwOuEP22oACas9u4CfMFFQJMAmL4IYvvuzzZK9nB5kWuWwTFKb8ppM0Bw6fRSkykttcCwzo9UXLC14iL1rxqScmcwn7uIUz94a01GhF8QTKCfxGChh1zrr5gfd7bT56jdvgNUE3agAiM45q8OCH7pWcK6yeDKM870540F3MEeUt-VpFjSrMA",
    "token_type": "bearer",
    "refresh_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsibXcvYWRtaW5hcHAiXSwidXNlcl9uYW1lIjoidXNlcjEiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiYXRpIjoiMGEzMWVkODYtYWZmMS00MjJhLTlkMjktODkxMGM5MWY2NDIwIiwiZXhwIjoxNTg0NjM5MTUyLCJhdXRob3JpdGllcyI6WyJBRE1JTiJdLCJqdGkiOiJhNTc5YzlhNC0wODc2LTQyNzItOWEwMi0wYjBlNjU2MmU2MjIiLCJjbGllbnRfaWQiOiJhZG1pbmFwcCJ9.QOs6i6oxQKXvb8EvxqqK24nthO9RLHJPNF8j9ut4N0NFYBzZeIcyCNSgYWBwrHQghx_t-NK0KxM9Y2CQeu999JHHWWiyS4q5lpZKKXmUUplZHA_WGq7h-ikMvR-PjaF4Cj42JcqXe2OB2JYnLBodrhL6fC3AAsjnmN51Ci2lcRzFpPohw_goLGNErhqrR3duXAJsg8Jz-o4TMEnKSewE4hdZduZ6kvET5Om-yuJPqoGv3lmv45mBUxobxuOJRRCdAqBVV43LetSA20S7HqlNDik2B_U9SGL1dWf3O4tjQBJ3VDjDyIJE09xhdHLYpT5msTFGA5A7zd62_tf4ydlouA",
    "expires_in": 3599,
    "scope": "read write",
    "jti": "0a31ed86-aff1-422a-9d29-8910c91f6420"
  }
```
