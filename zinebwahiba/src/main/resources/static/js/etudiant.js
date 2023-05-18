// ---------horizontal-navbar-menu-----------
$(function() {
    $(".toggle").on("click", function() {
        if ($(".item").hasClass("active")) {
            $(".item").removeClass("active");
        } else {
            $(".item").addClass("active");
        }
    });
});


// **********************************************************tooltip**************************************************

$(document).ready(function(){



    // Filter table rows based on searched term
    $("#search").on("keyup", function() {
        var term = $(this).val().toLowerCase();
        $("table tbody tr").each(function(){
            $row = $(this);
            var name = $row.find("td:nth-child(2)").text().toLowerCase();
            console.log(name);
            if(name.search(term) < 0){
                $row.hide();
            } else{
                $row.show();
            }
        });
    });
});









$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
    var actions = $("table td:last-child").html();
    //************************************** Append table with add row form on add new button click*************************************
    $(".add-new").click(function(){
        $(this).attr("disabled", "disabled");
        var index = $("table tbody tr:last-child").index();
        var row = '<tr>' +
            '<td><input type="text" class="form-control" name="cne" id="cne"></td>' +
            '<td><input type="text" class="form-control" name="nom" id="nom"></td>' +
            '<td><input type="text" class="form-control" name="prenom" id="prenom"></td>' +
            '<td><input type="text" class="form-control" name="filiere" id="filiere"></td>' +
            '<td><input type="text" class="form-control" name="element" id="element"></td>' +
            '<td><input type="text" class="form-control" name="note" id="note"></td>' +
            '<td>' + actions + '</td>' +
            '</tr>';
        $("table").append(row);
        $("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
        $('[data-toggle="tooltip"]').tooltip();
    });
    // Add row on add button click
    $(document).on("click", ".add", function(){
        var empty = false;
        var input = $(this).parents("tr").find('input[type="text"]');
        input.each(function(){
            if(!$(this).val()){
                $(this).addClass("error");
                empty = true;
            } else{
                $(this).removeClass("error");
            }
        });
        $(this).parents("tr").find(".error").first().focus();
        if(!empty){
            input.each(function(){
                $(this).parent("td").html($(this).val());
            });
            $(this).parents("tr").find(".add, .edit").toggle();
            $(".add-new").removeAttr("disabled");
        }
    });
    // ***************************************************Edit row on edit button click************************************************
    $(document).on("click", ".edit", function(){
        $(this).parents("tr").find("td:not(:last-child)").each(function(){
            $(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
        });
        $(this).parents("tr").find(".add, .edit").toggle();
        $(".add-new").attr("disabled", "disabled");
    });
    // Delete row on delete button click
    $(document).on("click", ".delete", function(){
        $(this).parents("tr").remove();
        $(".add-new").removeAttr("disabled");
    });
});



    function ExportToExcel(type, fn, dl) {
    var elt = document.getElementById('DataTable');
    var wb = XLSX.utils.table_to_book(elt, { sheet: "sheet1" });
    return dl ?
    XLSX.write(wb, { bookType: type, bookSST: true, type: 'base64' }):
    XLSX.writeFile(wb, fn || ('MySheetName.' + (type || 'xlsx')));
}










