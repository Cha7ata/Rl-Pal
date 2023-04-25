package com.eniso.rlpal.services.implementation;


import com.eniso.rlpal.dto.PostDto;
import com.eniso.rlpal.exception.EntityNotFoundException;
import com.eniso.rlpal.exception.InvalidOperationException;
import com.eniso.rlpal.model.Post;
import com.eniso.rlpal.model.User;
import com.eniso.rlpal.repository.IPostRepository;
import com.eniso.rlpal.services.IPostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PostDto save(Post dto) {

        return PostDto.builder()
                .contenu(dto.getContenu())
                .user(dto.getUser())
                .build();
    }

    @Override
    public List<PostDto> findAll() {
        return repository.findAll().stream()
                .map((kpi -> modelMapper
                        .map(kpi, PostDto.class)))
                .collect(Collectors.toList());
    }
    @Override
    public void delete(Integer id) {
        PostDto dto = findById(id);
        if (dto == null) {
            throw new EntityNotFoundException( ""+ id);
        }
        repository.deleteById(id);
    }

    @Override
    public void update(Integer id, String title, String value) {

    }

    @Override
    public void update(Integer id, String contenue, User user) {

        Optional<Post> kpi = repository.findById(id);

        if (!kpi.isEmpty()) {
            throw new InvalidOperationException("this Post is already empty-_-");
        }
        Post kpi1 = kpi.get();
        kpi1.setContenu(contenue);
        kpi1.setUser(user);

        repository.save(kpi1);

    }

    @Override
    public PostDto findById(Integer id) {

        return repository.findById(id).map((media -> modelMapper.map(media, PostDto.class))).orElseThrow(
                () -> new EntityNotFoundException("user not found")
        );
    }

    @Override
    public PostDto save(PostDto dto) {
        return null;
    }
}
