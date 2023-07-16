package com.university.lecture.application.interfaces;

import java.util.List;

public interface CommonService<Request, Response, IdType> {
    
    public List<Response> findAll(Request request);

    public Response findById(IdType id);

    public Response create(Request request);

    public Response update(Request request, IdType id);

    public void delete(IdType id);

}
