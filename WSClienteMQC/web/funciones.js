$(function(){
    $("#frmCliente").bind("submit",function(){
        return Create();
    });
    function Create(){
        $.ajax({
                url:'cliente.do',
           type:'POST',
           data:{
               nomAlumno:$("#txtNomAlumno").val()
           }, 
           succes:function(responseText){
               
           }
               } );
               
    } 
    List()
    function List(){
        $.ajax({
            url:'cliente.do',
            data:{},
                    type:'GET',
                    dataType:'json',
                    success: function(respJson){
                        $("#tblList").html("");
                        $("#tblList").html(
                                "<tread>"+
                                "<tr>"+
                                "<th>Id</th>"+
                                "<th>Nombre Alumno</th>"+
                                "</tr>"+
                                "</tread>"+
                                "<tbody>"+
                                "</tbody>"       
                                );
                        for(var i in resJson){
                            var alumno=resJson(i);
                            $("#tblList tbody").append(
                                 "<tr>"+
                                 "<tr>"+alumno.idAlumno+"</tr>"+
                                 "<tr>"+alumno.nombreAlumno+"</tr>"+
                                 "</tr>"
                                    
                                    );
                        }
                    }
                    });
    }
});
