package com.projeto_integrador_gen.egide.security.inst;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.projeto_integrador_gen.egide.model.Instituicao;
import com.projeto_integrador_gen.egide.repository.InstituicaoRepository;

@Service
public class InstDetailsService implements UserDetailsService {

	@Autowired
	private InstituicaoRepository InstuicaoRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Instituicao> user = InstituicaoRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found"));
		return user.map(InstDetailsImpl::new).get();
	}

}