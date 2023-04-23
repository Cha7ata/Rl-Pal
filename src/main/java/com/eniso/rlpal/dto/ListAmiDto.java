package com.eniso.rlpal.dto;

import com.eniso.rlpal.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListAmiDto {
    private List<User> listAmi;
}
