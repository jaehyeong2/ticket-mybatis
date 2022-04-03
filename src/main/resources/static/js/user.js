let index = {
    init: function () {
        $("#btn-save").on("click", () => {
            this.save();
        });
        $("#btn-delete").on("click", () => {
            this.deleteById();
        });
        $("#btn-update").on("click", () => {
            this.update();
        });
        $("#btn-comment-save").on("click", () => {
            this.commentSave();
        });
        $("#btn-comment-delete").on("click", () => {
            this.commentDelete();
        });
    },

    save: function () {
        let data = {
            name: $("#name").val(),
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val(),
            gender: $("#gender").val(),
            eventAgreement: $("#eventAgreement").val()
        };

        $.ajax({
            type: "POST",
            url: "/signup",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        }).done(function () {
            console.log(data);
            // alert("회원가입이 완료되었습니다.");
            swal('회원가입 성공',$("#username").val() +'님 회원가입을 축하합니다!\n\n한달간 무료로 PERSONL 멤버십의 서비스를\n 이용하실 수 있습니다.');
            // location.href="/";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
}
index.init();