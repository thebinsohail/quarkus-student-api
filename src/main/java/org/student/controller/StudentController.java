package org.student.controller;

import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.student.entity.Student;
import org.student.service.StudentService;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentController {

    @Inject
    private StudentService studentService;

    @GET
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }

    /* Adding the student to the database */

    @Transactional
    @POST
    public Response saveStudent(@Valid Student student) {
        try {
            studentService.addStudent(student);
            System.out.println(student.getFullName() + " Saved!");
            return Response.status(200).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }

    }

    /* Deleting a student from the database using id */
    @Transactional
    @DELETE
    @Path("/{id}")
    public Response deleteStudent(@PathParam("id") Long id) {
        try {

            System.out.println(id);
            studentService.removeStudent(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.status(200).build();
    }

    // /* Getting a single student from a database */

    // public Student getAllStudents() {
    // return studentService.getStudents();
    // }

}
