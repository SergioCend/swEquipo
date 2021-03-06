/* ========================================================================
 * Copyright 2014 Sarmiento
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 Sarmiento

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.Sarmiento.curso.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.inject.Inject;

import co.edu.uniandes.csw.Sarmiento.curso.logic.api.ICursoLogicService;
import co.edu.uniandes.csw.Sarmiento.curso.logic.dto.CursoDTO;


public abstract class _CursoService {

	@Inject
	protected ICursoLogicService cursoLogicService;
	
	@POST
	public CursoDTO createCurso(CursoDTO curso){
		return cursoLogicService.createCurso(curso);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteCurso(@PathParam("id") Long id){
		cursoLogicService.deleteCurso(id);
	}
	
	@GET
	public List<CursoDTO> getCursos(){
		return cursoLogicService.getCursos();
	}
	
	@GET
	@Path("{id}")
	public CursoDTO getCurso(@PathParam("id") Long id){
		return cursoLogicService.getCurso(id);
	}
	
	@PUT
    @Path("{id}")
	public void updateCurso(@PathParam("id") Long id, CursoDTO curso){
		cursoLogicService.updateCurso(curso);
	}
	
}