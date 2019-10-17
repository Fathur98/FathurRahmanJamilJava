<%@ page import="model.BootcampMember" %>
<%@ page import="controller.Controller" %>
<%--
  Created by IntelliJ IDEA.
  User: ptap
  Date: 10/10/2019
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String nama = (String)request.getParameter("nama");
    String jenis = (String)request.getParameter("jenis");
    String pendidikan = (String)request.getParameter("pendidikan");
    String jurusan = (String)request.getParameter("jurusan");
    Integer tinggi = Integer.parseInt(request.getParameter("tinggibadan"));
    Integer berat = Integer.parseInt(request.getParameter("beratbadan"));
    String nilai = (String)request.getParameter("nilai");
    String riwayat = (String)request.getParameter("riwayat");
    BootcampMember member = new BootcampMember(nama,jenis,pendidikan,jurusan,riwayat,tinggi,berat,nilai);
    Controller control = new Controller();
    String propor = control.propor(member.getTinggibadan(),member.getBeratbadan());
%>
<html>
<style>
    #customers {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    #customers td, #customers th {
        border: 1px solid #ddd;
        padding: 8px;
    }

    #customers tr:nth-child(even){background-color: #f2f2f2;}

    #customers tr:hover {background-color: #ddd;}

    #customers th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: left;
        background-color: #4CAF50;
        color: white;
    }
</style>
<head>
    <title>Fathur2</title>
</head>
<body style="margin: 80px">

    <h1 style="text-align: center">DAFTAR MAHASISWA</h1>
    <table border="3" id="customers">
        <tr>
            <th>Nama</th>
            <th>Jenis Kelamin</th>
            <th>Pendidikan</th>
            <th>Jurusan</th>
            <th>Tinggi Badan</th>
            <th>Berat Badan</th>
            <th>Nilai Matematika</th>
            <th>Riwayat Penyakit</th>
        </tr>
        <tr>
            <td><%= nama %></td>
            <td><%= jenis %></td>
            <td><%= pendidikan %></td>
            <td><%= jurusan %></td>
            <td><%= tinggi %></td>
            <td><%= berat %></td>
            <td><%= nilai %></td>
            <td><%= riwayat %></td>
        </tr>
    </table>
    <br>
    <h2><%= propor %></h2>
    <a href="index.jsp">Kembali</a>
</body>
</html>
