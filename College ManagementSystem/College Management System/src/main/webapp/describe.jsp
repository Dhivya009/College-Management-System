<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>UCEP JSP</title>
</head>

<body style="background-color: #a89879ea;">
    
    <centre<h1>Welcome!</h1></centre>
    <h2>UCEP Portal</h2>
    <br>

    <h3>Add Department</h3>
    <br>
            <form action="addDept">
                <label for ="deptName"> DeptName </label><br>
                 <input type="text" name="deptName"> <br>
                  <label for ="deptNo"> DeptNo </label><br>
                 <input type="text" name="deptNo"> <br>
                 <label for ="deptStaffCount"> DeptStaffCount</label><br>
                <input type="text" name="deptStaffCount"><br>
                 <label for ="deptLabCount"> DeptLabCount</label><br>
                <input type="text" name="deptLabCount"><br>
                       <input type="submit">
            </form>
            <h3> View Department</h3>

    <form action="viewDept">
         <label for ="deptno">DeptNo</label><br>
         <input type="text" name="deptNo"> <br>
               <input type="submit">
    </form>
    <h3>Delete Department</h3>

    <form action="deleteDept">
         <label for ="deptLabCount">DeptLabCount</label><br>
         <input type="text" name="deptLabCount"> <br>
               <input type="submit">
    </form>
<h3> Update Department</h3>

    <form action ="updateDept"> 
           <label for ="deptNo"> DeptNo</label><br>
       <input type ="text" name="deptNo"><br>
        <label for ="deptLabCount"> DeptLabCount </label><br>
        <input type ="text" name="deptLabCount"><br>
        <input type ="submit">
    </form>
</body>

    
    
   
</html>
             
            