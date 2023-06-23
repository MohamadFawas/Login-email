package com.defect.tracker.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProjectType is a Querydsl query type for ProjectType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectType extends EntityPathBase<ProjectType> {

    private static final long serialVersionUID = 797244812L;

    public static final QProjectType projectType = new QProjectType("projectType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QProjectType(String variable) {
        super(ProjectType.class, forVariable(variable));
    }

    public QProjectType(Path<? extends ProjectType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectType(PathMetadata metadata) {
        super(ProjectType.class, metadata);
    }

}

