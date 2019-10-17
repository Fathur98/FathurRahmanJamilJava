<%--
  Created by IntelliJ IDEA.
  User: ptap
  Date: 10/10/2019
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title>Fathur1</title>
  </head>
  <body style="margin: 80px">
    <h1 class="heading" style="text-align: center; padding: auto">FORM PENDAFTARAN</h1>

    <form action="target.jsp" method="POST">
      <div class="form-group">
        <label for="nama">NAMA</label>
        <input type="text" class="form-control" id="nama" placeholder="masukkan nama" name="nama" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="jeniskelamin">JENIS KELAMIN</label>
        <select name="jenis" id="jeniskelamin" value="Laki-Laki" required>
          <option>Laki-Laki</option>
          <option>Perempuan</option>
        </select>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="pendidikan">PENDIDIKAN</label>
        <select name="pendidikan" id="pendidikan" value="SMA" required>
          <option>SMK</option>
          <option>SMA</option>
        </select>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group" id="inputjurusan">
        <label for="jurusan">JURUSAN</label>
        <input type="text" class="form-control" id="jurusan" placeholder="masukkan jurusan" name="jurusan" value="-">
      </div>

      <div class="form-group">
        <label for="tinggibadan">TINGGI BADAN</label>
        <input type="number" class="form-control" id="tinggibadan" placeholder="masukkan tinggi badan" name="tinggibadan" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="beratbadan">BERAT BADAN</label>
        <input type="number" class="form-control" id="beratbadan" placeholder="masukkan berat badan" name="beratbadan" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="nilai">NILAI MATEMATIKA</label>
        <input type="number" class="form-control" id="nilai" placeholder="masukkan nilai" name="nilai" required>
        <div class="valid-feedback">Valid.</div>
        <div class="invalid-feedback">Please fill out this field.</div>
      </div>

      <div class="form-group">
        <label for="riwayat">RIWAYAT PENYAKIT</label>
        <input type="text" class="form-control" id="riwayat" placeholder="masukkan riwayat penyakit" name="riwayat" value="-">
      </div>

      <br>
      <%--<button type="button" name="button" id="validasi">Validasi</button>--%>
      <button type="submit" name="submit" id="kirim" disabled="disabled">Kirim !</button>
      <br><br>
      <p>Nama yang ditambahkan</p>
      <div id="listnama"></div>
    </form>

    <script>
        $(document).ready(function(){

            $("#validasi").click(function(){
                var tinggibadan = $("#tinggibadan").val();
                var beratbadan = $("#beratbadan").val();

                var propor1 = (tinggibadan*tinggibadan)/10000;
                var propor2 = beratbadan / propor1;

                if (propor2 < 18.5){
                    alert("Berat badan anda kurang")
                } else if (propor2 < 22.9){
                    alert("Berat badan anda normal")
                } else if (propor2 < 29.9){
                    alert("Berat badan anda berlebih")
                } else if (propor2 >= 29.9){
                    alert("Berat badan anda obesitas")
                } else {
                    alert("Berat badan anda belum diisi")
                }
            });

            $("#pendidikan").change(function(){
                if($(this).val()=="SMA"){
                    $("#inputjurusan").hide();
                }else{
                    $("#inputjurusan").show();
                }
            });


            $("#kirim").prop("disabled",true);
            $("#nama").keyup(function(){
                if($(this).val().length > 0){
                    $("#kirim").prop("disabled",false);
                }else{
                    $("#kirim").prop("disabled",true);
                }
            });

            // $("#nama").change(function(){
            // 	var nama = $("#nama").val();

            // 	if(nama.length > 0){
            // 		$("#kirim").removeAttr("disabled");
            // 	}else{
            // 		$("#kirim").attr("disabled","disabled");
            // 	}
            // });

            $("#kirim").click(function(){
                var nama = $("#nama").val();
                $("#listnama").html("<h4>"+nama+"</h4>")
            });

        });
    </script>
  </body>
</html>