FORMAT: 1A



# Group ユーザ

## 共通エラーレスポンス

#### エラー処理

+ Response 400 (application/json)

    + Attributes 
        status_code: 400
        messege":不正なリクエストです

+ Response 404 (application/json)

    + Attributes 
        status_code: 404
        messege":該当リソースが存在しません

## ユーザのエンドポイント [/v1/users]

### ユーザ登録 [POST]

#### 処理概要

* ユーザ情報を新しく登録する。
* 登録に成功した場合、アクセストークンを返す。

+ Request (application/json)

    + Headers

            Accept: application/json

    + Attributes

        + name: 名前 太郎 (string, required) - 名前
        + birth: 1990/05/03 (string, required) - 生年月日
        + email: test@example.com (string, required) - メールアドレス（format: email）
        + post_num: 560ー0033 (string, required) - 郵便番号
        + adress: '島根県邑智郡美郷町潮村' (string, required) - 住所
        + num_of_buy: 23 (number, required) - 購入回数
        + last_buy: 2020/08/09 (string, required) -最終購入日

+ Response 201 (application/json)

    + Attributes
        + accessToken: f58ba22059f5a8aa8f346e0f40987adab326041fac99029c909bef2c6300821a (string, required) - アクセストークン



## ユーザ情報 [/v1/users/{userId}]

### ユーザ情報取得API [GET]

#### 処理概要

* 指定した会員の情報を返す。
* userIdが必須。ない場合、BadRequestを返す。

+ Parameters

    + userId: 300 (number, required) - ユーザID

+ Response 200 (application/json)

    + Attributes
        + user (required)  
            + user_id: 12 (number,required)
            + name: 名前 太郎 (string, required)
            + birth: 1990/05/03 (string, required)
            + email: test@example.com (string, required)
            + post_num: 560ー0033 (string, required)
            + adress: '島根県邑智郡美郷町潮村' (string, required)
            + num_of_buy: 23 (number, required)
            + last_buy: 2020/08/09 (string, required)


###ユーザ情報変更API[PUT]

#### 処理概要
* 指定した会員の情報を更新する
* userIdが必須。ない場合、BadRequestを返す。

+ Request(application/json)

    + Attributes
        + user_id: 12 (number,required)
        + name: 名前 太郎 (string, required) - 名前
        + birth: 1990/05/03 (string, required) - 生年月日
        + email: test@example.com (string, required) - メールアドレス（format: email）
        + post_num: 560ー0033 (string, required) - 郵便番号
        + adress: '島根県邑智郡美郷町潮村' (string, required) - 住所
        + num_of_buy: 23 (number, required) - 購入回数
        + last_buy: 2020/08/09 (string, required) -最終購入日

+ Response 201 (application/json)

    + Attributes
        + user_id: 12 (number,required)
        + name: 名前 太郎 (string, required) - 名前
        + birth: 1990/05/03 (string, required) - 生年月日
        + email: test@example.com (string, required) - メールアドレス（format: email）
        + post_num: 560ー0033 (string, required) - 郵便番号
        + adress: '島根県邑智郡美郷町潮村' (string, required) - 住所
        + num_of_buy: 23 (number, required) - 購入回数
        + last_buy: 2020/08/09 (string, required) -最終購入日

###ユーザ情報削除API[DELETE]

#### 処理概要
* 指定した会員の情報を削除する
* userIdが必須。ない場合、BadRequestを返す。


+ Request(application/json)

    + Attributes
        + user_id: 12 (number,required)

+ Response 201 (application/json)

    + Attributes
        + massege:success:(string,required)
