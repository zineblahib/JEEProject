// ---------horizontal-navbar-menu-----------
$(function () {
    $(".toggle").on("click", function () {
        if ($(".item").hasClass("active")) {
            $(".item").removeClass("active");
        } else {
            $(".item").addClass("active");
        }
    });
});


// ******tooltip******

$(document).ready(function () {



    // Filter table rows based on searched term
    $("#search").on("keyup", function () {
        var term = $(this).val().toLowerCase();
        $("table tbody tr").each(function () {
            $row = $(this);
            var name = $row.find("td:nth-child(2)").text().toLowerCase();
            console.log(name);
            if (name.search(term) < 0) {
                $row.hide();
            } else {
                $row.show();
            }
        });
    });
});









