$(document).ready(function () {
    updateQuestions();
});

function updateQuestions() {
    $.ajax({
        url:"/questions",
        type:"GET",
        dataType: "html",
        success: function(data) {
            $("#accordion").html(data);
        }
    })
}